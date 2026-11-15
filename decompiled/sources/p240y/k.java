package p240y;

import p230x.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean[] f50757a = new boolean[3];

    static void a(f fVar, d dVar, e eVar) {
        eVar.f50646j = -1;
        eVar.f50648k = -1;
        e.b bVar = fVar.f50614M[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f50614M[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.f50603B.f50587e;
            int iP = fVar.P() - eVar.f50605D.f50587e;
            d dVar2 = eVar.f50603B;
            dVar2.f50589g = dVar.q(dVar2);
            d dVar3 = eVar.f50605D;
            dVar3.f50589g = dVar.q(dVar3);
            dVar.f(eVar.f50603B.f50589g, i10);
            dVar.f(eVar.f50605D.f50589g, iP);
            eVar.f50646j = 2;
            eVar.k0(i10, iP);
        }
        if (fVar.f50614M[1] == bVar2 || eVar.f50614M[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i11 = eVar.f50604C.f50587e;
        int iV = fVar.v() - eVar.f50606E.f50587e;
        d dVar4 = eVar.f50604C;
        dVar4.f50589g = dVar.q(dVar4);
        d dVar5 = eVar.f50606E;
        dVar5.f50589g = dVar.q(dVar5);
        dVar.f(eVar.f50604C.f50589g, i11);
        dVar.f(eVar.f50606E.f50589g, iV);
        if (eVar.f50626Y > 0 || eVar.O() == 8) {
            d dVar6 = eVar.f50607F;
            dVar6.f50589g = dVar.q(dVar6);
            dVar.f(eVar.f50607F.f50589g, eVar.f50626Y + i11);
        }
        eVar.f50648k = 2;
        eVar.z0(i11, iV);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
