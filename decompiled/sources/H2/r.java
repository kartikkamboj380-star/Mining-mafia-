package H2;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    class a implements D {
        a() {
        }

        @Override // H2.D
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(p013b2.h hVar) {
            return hVar.size();
        }
    }

    public static n a(Y1.n nVar, p013b2.d dVar, x.a aVar) {
        w wVar = new w(new a(), aVar, nVar, null, false, false);
        dVar.a(wVar);
        return wVar;
    }
}
