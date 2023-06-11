package tools;
interface university{
    void Name();
    void NIRF();
    void city();


}

public class pac implements university {
    @Override
    public void Name() {
        System.out.println("VIT");
    }

    @Override
    public void NIRF() {
        System.out.println(9);
    }

    @Override
    public void city() {
        System.out.println("Vellore");
    }
}
