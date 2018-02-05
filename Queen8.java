public class Queen8 {
    public static int num = 0;  // 记录摆放方案个数
    public static final int MAXQUEEN = 8;
    public static int[] cols = new int[MAXQUEEN];

    public Queen8() {
        getArrangement(0);
        System.out.println();
        System.out.println(MAXQUEEN + "皇后问题有" + num + "种摆放方法。");
    }

    // Recursive call the fuction getArrangement()
    public void getArrangement(int n) {
        /* (1)遍历该列所有不合法的行，并用rows数组记录，不合法即rows[i]=true   */
        boolean[] rows = new boolean[MAXQUEEN];

        for (int i = 0; i < n; i++) {
        //不在同一行
        rows[cols[i]] = true;
        int d = n - i;

        //不在同一斜对角线和反对角线
        if (cols[i] - d >= 0)
            rows[cols[i] - d] = true;
        if (cols[i] + d <= MAXQUEEN - 1)
            rows[cols[i] + d] = true;
        }

        
        /* (2)遍历该列所有行，判断该行是否合法，递归调用getArrangement() */
        for (int i = 0; i < MAXQUEEN; i++) {
            //判断该行是否合法
            if (rows[i])
                continue;
            //设置当前列合法棋子所在行数, cols[] is global variable, traverse all the rows
            cols[n] = i;    
            //当前列不为最后一列时 
            if (n < MAXQUEEN - 1) {
                getArrangement(n + 1);
            }
            else {
                //累计方案个数 
                num++;
                //打印棋盘信息
                printChessBoard(); 
            }

        }
        
    }

    public void printChessBoard() {
        System.out.print("第" + num + "种走法" + "\n");
        int count = 0;

        for (int i = 0; i < MAXQUEEN; i++) {
            for (int j = 0; j < MAXQUEEN; j++) {
                if (i == cols[j]) {
                    System.out.print("0 ");
                }
                else {
                    System.out.print("+ ");
                }

                count++;

                if (count % 8 == 0)
                    System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Queen8 queen = new Queen8();
    }
}

