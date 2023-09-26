import java.util.ArrayList;

public class Main {
    static ArrayList<String> al = new ArrayList<String>();
    static final int maxSize = 5;

    public static void makeWords(int length, String word) {

        if (length > maxSize) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            char letter = (char) ((int) 'A' + i);
            al.add(word + letter);
            makeWords(length + 1, word+letter);
        }
    }

        public static void main(String[] args){
            String pw1 = "1c75d402fb481523acd44e9d8247bc80";
            String pw2 = "5b1d59b5451c06afb65ab1bc2713cfb4";

            PasswordHash ph = new PasswordHash();
            makeWords(1, "");

            for (int i = 0; i < al.size(); i++) {
                if (ph.hashPW(al.get(i)).equals(pw1)) {
                    System.out.println("Found Password 1: " + al.get(i));
                } else if (ph.hashPW(al.get(i)).equals(pw2)) {
                    System.out.println("Found Password 2: " + al.get(i));
                }

            }

        }
    }
