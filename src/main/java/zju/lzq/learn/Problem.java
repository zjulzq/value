package zju.lzq.learn;

public class Problem {
	private String question;
	private String answer;

	public Problem(String question, String answer) {
		super();
		this.question = question;
		this.answer = answer;
	}

	public String getQuestion() {
		return question;
	}

	public String getAnswer() {
		return answer;
	}

	public boolean isCorrect(String response) {
		return response.trim().equalsIgnoreCase(answer);
	}
}
