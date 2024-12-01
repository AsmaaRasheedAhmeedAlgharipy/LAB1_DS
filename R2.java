
    class GameEntry {
        private int score;

        public GameEntry(int score) {
            this.score = score;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            int score1 = this.score;

        }
    }

    public class R2 {
        public static void main(String[] args) {
            GameEntry[] A = new GameEntry[5];
            for (int i = 0; i < A.length; i++) {
                A[i] = new GameEntry(i * 10);
            }
            GameEntry[] B = A.clone();
            A[4].setScore(550);
            System.out.println("Score of B[4]: " + B[4].getScore());
            for (int i = 0; i < A.length; i++) {
                System.out.println("A["+i+"]"+A[i].getScore());
                System.out.println("B["+i+"]"+B[i].getScore());

            }
        }
    }

