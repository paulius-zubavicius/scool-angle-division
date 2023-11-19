package com.owr.division;

import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ActionsOutput {

	public void angleDivision(DataInput input, DataResult result, Consumer<String> linesPrinter) {

		{
			// 1'st line
			StringBuilder line = new StringBuilder();
			line.append(input.getNum());
			line.append(" │ "); // ─└│
			line.append(input.getDiv());
			linesPrinter.accept(line.toString());
		}

		int startPos = 0;
		for (int i = 0; i < result.getIterations().size(); i++) {

			long origRemainder = result.getIterations().get(i).getOrigRemainder();
			int remLenght = String.valueOf(origRemainder).length();

//			if (origRemainder < 10) {
//				startPos = i - remLenght; // for additional 0 in the  begginig
//			} else  {
			startPos = i + 1 - remLenght;
//			}

			// Current reminder
			StringBuilder line = new StringBuilder();
			line.append(repeatSimbol(startPos, ' '));
//			if (origRemainder < 10) {
//				line.append("0");
//			}
			line.append(result.getIterations().get(i).getOrigRemainder());
			if (i == 0) {
				int numLenght = String.valueOf(input.getNum()).length();
				line.append(repeatSimbol(numLenght + 3 - remLenght, ' '));
				line.append(result.getResult());
			}
			linesPrinter.accept(line.toString());

			// New int part

			line = new StringBuilder();
			line.append(repeatSimbol(startPos, ' '));
			line.append(String.valueOf(result.getIterations().get(i).getIntPart() * input.getDiv()));
			linesPrinter.accept(line.toString());

			// add substraction line:
			line = new StringBuilder();
			line.append(repeatSimbol(startPos, ' '));
			line.append(repeatSimbol(remLenght, '─'));
			linesPrinter.accept(line.toString());
		}

		StringBuilder line = new StringBuilder();
		line.append(repeatSimbol(startPos, ' '));
		line.append(result.getRemainder());
		linesPrinter.accept(line.toString());
	}

	private String repeatSimbol(int times, char simbol) {
		return IntStream.range(0, times).mapToObj(i -> String.valueOf(simbol)).collect(Collectors.joining());
	}

	public void description(DataResult result, Consumer<String> linesPrinter) {

		for (Iteration iter : result.getIterations()) {
			linesPrinter.accept(
					"Nusikeliam skaičių " + iter.getLiftedDown() + ". Dabar likutis: " + iter.getOrigRemainder());
			linesPrinter.accept(" - Į likutį " + iter.getOrigRemainder() + " telpa " + iter.getIntPart()
					+ " daliklis(ai). Prirašom prie rezultato: " + iter.getResult());
			linesPrinter.accept(" - Iš likutčio " + iter.getOrigRemainder() + " atimam " + iter.getSubs()
					+ " ir gaunam naują likutį " + iter.getRemainder());
		}
	}

}
