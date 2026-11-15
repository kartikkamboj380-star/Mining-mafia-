package G0;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class t extends AbstractC0575k {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    int f904f0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    ArrayList f902d0 = new ArrayList();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f903e0 = true;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    boolean f905g0 = false;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f906h0 = 0;

    class a extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC0575k f907a;

        a(AbstractC0575k abstractC0575k) {
            this.f907a = abstractC0575k;
        }

        @Override // G0.AbstractC0575k.f
        public void e(AbstractC0575k abstractC0575k) {
            this.f907a.d0();
            abstractC0575k.Z(this);
        }
    }

    static class b extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        t f909a;

        b(t tVar) {
            this.f909a = tVar;
        }

        @Override // G0.q, G0.AbstractC0575k.f
        public void d(AbstractC0575k abstractC0575k) {
            t tVar = this.f909a;
            if (tVar.f905g0) {
                return;
            }
            tVar.k0();
            this.f909a.f905g0 = true;
        }

        @Override // G0.AbstractC0575k.f
        public void e(AbstractC0575k abstractC0575k) {
            t tVar = this.f909a;
            int i10 = tVar.f904f0 - 1;
            tVar.f904f0 = i10;
            if (i10 == 0) {
                tVar.f905g0 = false;
                tVar.q();
            }
            abstractC0575k.Z(this);
        }
    }

    private void p0(AbstractC0575k abstractC0575k) {
        this.f902d0.add(abstractC0575k);
        abstractC0575k.f849I = this;
    }

    private void y0() {
        b bVar = new b(this);
        ArrayList arrayList = this.f902d0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((AbstractC0575k) obj).b(bVar);
        }
        this.f904f0 = this.f902d0.size();
    }

    @Override // G0.AbstractC0575k
    public void X(View view) {
        super.X(view);
        int size = this.f902d0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC0575k) this.f902d0.get(i10)).X(view);
        }
    }

    @Override // G0.AbstractC0575k
    public void b0(View view) {
        super.b0(view);
        int size = this.f902d0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC0575k) this.f902d0.get(i10)).b0(view);
        }
    }

    @Override // G0.AbstractC0575k
    protected void cancel() {
        super.cancel();
        int size = this.f902d0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC0575k) this.f902d0.get(i10)).cancel();
        }
    }

    @Override // G0.AbstractC0575k
    protected void d0() {
        if (this.f902d0.isEmpty()) {
            k0();
            q();
            return;
        }
        y0();
        int i10 = 0;
        if (this.f903e0) {
            ArrayList arrayList = this.f902d0;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((AbstractC0575k) obj).d0();
            }
            return;
        }
        for (int i11 = 1; i11 < this.f902d0.size(); i11++) {
            ((AbstractC0575k) this.f902d0.get(i11 - 1)).b(new a((AbstractC0575k) this.f902d0.get(i11)));
        }
        AbstractC0575k abstractC0575k = (AbstractC0575k) this.f902d0.get(0);
        if (abstractC0575k != null) {
            abstractC0575k.d0();
        }
    }

    @Override // G0.AbstractC0575k
    public void f0(AbstractC0575k.e eVar) {
        super.f0(eVar);
        this.f906h0 |= 8;
        int size = this.f902d0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC0575k) this.f902d0.get(i10)).f0(eVar);
        }
    }

    @Override // G0.AbstractC0575k
    public void g(v vVar) {
        if (K(vVar.f912b)) {
            ArrayList arrayList = this.f902d0;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                AbstractC0575k abstractC0575k = (AbstractC0575k) obj;
                if (abstractC0575k.K(vVar.f912b)) {
                    abstractC0575k.g(vVar);
                    vVar.f913c.add(abstractC0575k);
                }
            }
        }
    }

    @Override // G0.AbstractC0575k
    public void h0(AbstractC0571g abstractC0571g) {
        super.h0(abstractC0571g);
        this.f906h0 |= 4;
        if (this.f902d0 != null) {
            for (int i10 = 0; i10 < this.f902d0.size(); i10++) {
                ((AbstractC0575k) this.f902d0.get(i10)).h0(abstractC0571g);
            }
        }
    }

    @Override // G0.AbstractC0575k
    void i(v vVar) {
        super.i(vVar);
        int size = this.f902d0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC0575k) this.f902d0.get(i10)).i(vVar);
        }
    }

    @Override // G0.AbstractC0575k
    public void i0(s sVar) {
        super.i0(sVar);
        this.f906h0 |= 2;
        int size = this.f902d0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC0575k) this.f902d0.get(i10)).i0(sVar);
        }
    }

    @Override // G0.AbstractC0575k
    public void k(v vVar) {
        if (K(vVar.f912b)) {
            ArrayList arrayList = this.f902d0;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                AbstractC0575k abstractC0575k = (AbstractC0575k) obj;
                if (abstractC0575k.K(vVar.f912b)) {
                    abstractC0575k.k(vVar);
                    vVar.f913c.add(abstractC0575k);
                }
            }
        }
    }

    @Override // G0.AbstractC0575k
    String l0(String str) {
        String strL0 = super.l0(str);
        for (int i10 = 0; i10 < this.f902d0.size(); i10++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strL0);
            sb.append("\n");
            sb.append(((AbstractC0575k) this.f902d0.get(i10)).l0(str + "  "));
            strL0 = sb.toString();
        }
        return strL0;
    }

    @Override // G0.AbstractC0575k
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public t b(AbstractC0575k.f fVar) {
        return (t) super.b(fVar);
    }

    @Override // G0.AbstractC0575k
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC0575k clone() {
        t tVar = (t) super.clone();
        tVar.f902d0 = new ArrayList();
        int size = this.f902d0.size();
        for (int i10 = 0; i10 < size; i10++) {
            tVar.p0(((AbstractC0575k) this.f902d0.get(i10)).clone());
        }
        return tVar;
    }

    @Override // G0.AbstractC0575k
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public t c(View view) {
        for (int i10 = 0; i10 < this.f902d0.size(); i10++) {
            ((AbstractC0575k) this.f902d0.get(i10)).c(view);
        }
        return (t) super.c(view);
    }

    public t o0(AbstractC0575k abstractC0575k) {
        p0(abstractC0575k);
        long j10 = this.f868c;
        if (j10 >= 0) {
            abstractC0575k.e0(j10);
        }
        if ((this.f906h0 & 1) != 0) {
            abstractC0575k.g0(t());
        }
        if ((this.f906h0 & 2) != 0) {
            y();
            abstractC0575k.i0(null);
        }
        if ((this.f906h0 & 4) != 0) {
            abstractC0575k.h0(x());
        }
        if ((this.f906h0 & 8) != 0) {
            abstractC0575k.f0(s());
        }
        return this;
    }

    @Override // G0.AbstractC0575k
    void p(ViewGroup viewGroup, w wVar, w wVar2, ArrayList arrayList, ArrayList arrayList2) {
        long jB = B();
        int size = this.f902d0.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0575k abstractC0575k = (AbstractC0575k) this.f902d0.get(i10);
            if (jB > 0 && (this.f903e0 || i10 == 0)) {
                long jB2 = abstractC0575k.B();
                if (jB2 > 0) {
                    abstractC0575k.j0(jB2 + jB);
                } else {
                    abstractC0575k.j0(jB);
                }
            }
            abstractC0575k.p(viewGroup, wVar, wVar2, arrayList, arrayList2);
        }
    }

    public AbstractC0575k q0(int i10) {
        if (i10 < 0 || i10 >= this.f902d0.size()) {
            return null;
        }
        return (AbstractC0575k) this.f902d0.get(i10);
    }

    public int r0() {
        return this.f902d0.size();
    }

    @Override // G0.AbstractC0575k
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public t Z(AbstractC0575k.f fVar) {
        return (t) super.Z(fVar);
    }

    @Override // G0.AbstractC0575k
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public t a0(View view) {
        for (int i10 = 0; i10 < this.f902d0.size(); i10++) {
            ((AbstractC0575k) this.f902d0.get(i10)).a0(view);
        }
        return (t) super.a0(view);
    }

    @Override // G0.AbstractC0575k
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public t e0(long j10) {
        ArrayList arrayList;
        super.e0(j10);
        if (this.f868c >= 0 && (arrayList = this.f902d0) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC0575k) this.f902d0.get(i10)).e0(j10);
            }
        }
        return this;
    }

    @Override // G0.AbstractC0575k
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public t g0(TimeInterpolator timeInterpolator) {
        this.f906h0 |= 1;
        ArrayList arrayList = this.f902d0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC0575k) this.f902d0.get(i10)).g0(timeInterpolator);
            }
        }
        return (t) super.g0(timeInterpolator);
    }

    public t w0(int i10) {
        if (i10 == 0) {
            this.f903e0 = true;
            return this;
        }
        if (i10 == 1) {
            this.f903e0 = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
    }

    @Override // G0.AbstractC0575k
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public t j0(long j10) {
        return (t) super.j0(j10);
    }
}
