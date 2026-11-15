package O5;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    public static abstract class a {
        public abstract d a();

        public abstract a b(boolean z9);
    }

    public static d c(int i10) {
        return d(i10).a();
    }

    public static a d(int i10) {
        y yVar = new y();
        yVar.c(i10);
        yVar.b(false);
        return yVar;
    }

    public abstract boolean a();

    public abstract int b();
}
