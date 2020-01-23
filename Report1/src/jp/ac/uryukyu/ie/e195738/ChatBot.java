package jp.ac.uryukyu.ie.e195738;

import java.util.Scanner;

class Judge {
    String input; //ユーザ入力を格納する

    Judge(String txt) {
        input = txt; // inputにユーザ入力を保存
        if (input.contains("何歳")) {
            System.out.println("16歳だよ！");
        }
        System.out.println("Your input is = " + input); // 正常に読み込めたか出力して確認
        System.out.println("入力待ち……"); // 入力を促す説明文
    }
}

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("akanechan: 「じゃ～ん！プロちゃんの驚く顔が見たい野々原茜ちゃん登場ーっ！ね、驚いた？驚いた？茜みたいなダイヤの原石を前にしてビックリしちゃった？」");

        Scanner in = new Scanner(System.in); // 標準入力から読み込むスキャナ

        System.out.println("入力待ち……"); // 入力を促す説明文

        int count = 0;
        String txt = in.nextLine();
        while (!(txt.equals("bye"))) {
            count++;
            new Judge(txt);
        }
        count++;
        System.out.println("茜ちゃん人形作って待ってるね！");
        System.out.println("今日はプロちゃんとたった" + count + "回しか話してないよ？");

    }
}
