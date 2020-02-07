package jp.ac.uryukyu.ie.e195738;

import java.util.Scanner;

class Judge {
    String input; //ユーザ入力を格納する

    Judge(String txt) {
        input = txt; // inputにユーザ入力を保存
        if (input.contains("何歳")) {
            System.out.println("Sirii: それはおもしろい質問ですね。");
        }else if (input.contains("歌って")) {
            System.out.println("Sirii: すみませんが、それはできません。");
        }else if (input.contains("おみくじ")) {
            System.out.println("Sirii: えっと…ラッキーアイテムは、MacBookだと書いてありますよ。");
        }else {
            System.out.println("Sirii: すみません、よくわかりません。");
        }
        System.out.println("入力待ち……"); // 入力を促す説明文
    }
}

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("Sirii: はい! お呼びですか?");

        Scanner in = new Scanner(System.in); // 標準入力から読み込むスキャナ

        System.out.println("入力待ち……"); // 入力を促す説明文

        int count = 0; // 話した回数を数える変数

        for (int i=0; ; i++) {
            String txt = in.nextLine();
            if (txt.equals("bye.")) {
                count++;
                System.out.println("あなたとの" + count + "回の会話内容が、私をさらにアップデートしてくれます。");
                System.out.println("お話しできて楽しかったです……");
                break;
            }
            count++;
            new Judge(txt);
        }
    }
}
