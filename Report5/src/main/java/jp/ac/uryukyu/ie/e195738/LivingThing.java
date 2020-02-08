package jp.ac.uryukyu.ie.e195738;

/**
 * キャラクタークラス。
 *  String name; //キャラクターの名前
 *  int hitPoint; //キャラクターのHP
 *  int attack; //キャラクターの攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 */
public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name キャラクター名
     * @param maximumHP キャラクターのHP
     * @param attack キャラクターの攻撃力
     */
    public LivingThing(String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * 対象のdead（生死情報）を得るgetterメソッド。
     * @return dead
     */
    public boolean isDead(){
        return  dead;
    }

    /**
     * 対象のdead（生死情報）を変更するsetterメソッド。
     * @param condition 死んでいればtrue、生きていればfalse
     */
    public void setDead(boolean condition){
        dead = condition;
    }

    public String getName(){
        return name;
    }

    public int getHitPoint(){
        return hitPoint;
    }

    public void setHitPoint(int damage){
        hitPoint -= damage;
    }

    /**
     * 相手へ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param opponent 攻撃対象
     */
    public void attack(LivingThing opponent){
        int damage = (int)(Math.random() * attack);
        if (dead) {
            damage = 0;
        }else {
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
