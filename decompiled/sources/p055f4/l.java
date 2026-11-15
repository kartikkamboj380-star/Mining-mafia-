package p055f4;

import com.facebook.soloader.E;
import com.facebook.soloader.InterfaceC1414b;
import com.facebook.soloader.m;
import com.facebook.soloader.p;

/* JADX INFO: loaded from: classes2.dex */
public class l implements h {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p055f4.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        for (m mVar : eArr) {
            if (mVar instanceof InterfaceC1414b) {
                p.b("SoLoader", "Waiting on SoSource " + mVar.c());
                mVar.a();
            }
        }
        return true;
    }
}
