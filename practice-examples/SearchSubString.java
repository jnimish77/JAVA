
	import java.util.Scanner;

	public class SearchSubstring {
		public static void main(String args[]) {
			String substring = " ";

			String imp = "Sometimes I feel like only Google understands what I'm trying to say.";

			System.out.println(substring);
			if (imp.indexOf(args[0]) != -1) {
				System.out.printf("%s is a part of %s", args[0], imp);
			} else {
				System.out.printf("%s is not a part of %s ", args[0], imp);
			}
		}
	}

