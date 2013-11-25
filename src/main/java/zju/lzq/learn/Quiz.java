package zju.lzq.learn;

public class Quiz {
	private int currentProblem;
	private int tries;
	private int score;
	private String response;
	private String correctAnswer;

	private Problem[] problems = { new Problem("What trademarked slogan describes Java development? Write once, ...", "run anywhere"),
			new Problem("What are the first 4 bytes of every class file (in hexadecimal)?", "CAFEBABE"), new Problem("Problem3", "Answer3"),
			new Problem("Problem4", "Answer4"), new Problem("Problem5", "Answer5") };

	public Quiz() {
		startOver();
	}

	public String getQuestion() {
		return problems[currentProblem].getQuestion();
	}

	public String getAnswer() {
		return correctAnswer;
	}

	public int getScore() {
		return score;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String answerAction() {
		if (currentProblem >= problems.length) {
			return "startOver";
		}
		tries++;
		if (problems[currentProblem].isCorrect(response)) {
			score++;
			nextProblem();
			if (currentProblem == problems.length) {
				return "done";
			} else {
				return "success";
			}
		} else if (tries == 1) {
			return "again";
		} else {
			nextProblem();
			if (currentProblem == problems.length) {
				return "done";
			} else {
				return "failture";
			}
		}
	}

	public String startOverAction() {
		startOver();
		return "startOver";
	}

	private void startOver() {
		currentProblem = 0;
		score = 0;
		tries = 0;
		response = "";
	}

	private void nextProblem() {
		correctAnswer = problems[currentProblem].getAnswer();
		currentProblem++;
		tries = 0;
		response = "";
	}
}
