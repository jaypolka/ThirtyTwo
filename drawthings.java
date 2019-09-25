//cerner_2^5_2019
public class DrawThings extends javax.swing.JDialog
{
    static java.util.function.Supplier<Double> r = () -> Math.random() * 600;
    static java.awt.geom.GeneralPath p = new java.awt.geom.GeneralPath();
    static java.util.List<java.util.function.Consumer<java.awt.Graphics2D>> d = new java.util.ArrayList<>(
            java.util.Arrays.asList((g) -> p.moveTo(300d, 300d),
                    (g) -> g.setColor(new java.awt.Color((int) (Math.random() * (16777216 * .8)))),
                    (g) -> p.curveTo(300, r.get(), r.get(), 300, 300, r.get())));
    java.util.List<java.util.function.Consumer<java.awt.Graphics2D>> f = java.util.Arrays.asList(
            (g) -> g.clearRect(0, 0, 600, 600), (g) -> p.moveTo(0d, 0d), (g) -> d.stream().forEach((r) -> r.accept(g)),
            (g) -> g.draw(p), (g) -> p.reset(), (g) -> repaint());

    public void paint(java.awt.Graphics g)
    {
        f.stream().forEach((r) -> r.accept((java.awt.Graphics2D) g));
    }

    public static void main(String[] args)
    {
        for (int i = 0; i < 6; ++i)
            d.addAll(new java.util.ArrayList<>(d));

        DrawThings drawThings = new DrawThings();
        drawThings.setSize(600, 600);
        drawThings.setVisible(true);
    }
}
