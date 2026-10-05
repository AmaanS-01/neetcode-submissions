class Solution {
    public int calPoints(String[] operations) {
        List<Integer> record = new ArrayList<>();
        for (String op : operations) {
            switch (op) {
                case "+":
                    int n = record.size();
                    int sumLastTwo = record.get(n - 1) + record.get(n - 2);
                    record.add(sumLastTwo);
                    break;
                case "D":
                    int doubleLast = record.get(record.size() - 1) * 2;
                    record.add(doubleLast);
                    break;
                case "C":
                    record.remove(record.size() - 1);
                    break;
                default:
                    record.add(Integer.parseInt(op));
                    break;
            }
        }
        int total = 0;
        for (int score : record) {
            total += score;
        }
        return total;
    }
}