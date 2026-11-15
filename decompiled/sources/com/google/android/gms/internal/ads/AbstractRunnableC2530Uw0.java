package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Uw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractRunnableC2530Uw0 extends AbstractC4552nx0 implements Runnable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f24135j = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    com.google.common.util.concurrent.p f24136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Object f24137i;

    AbstractRunnableC2530Uw0(com.google.common.util.concurrent.p pVar, Object obj) {
        pVar.getClass();
        this.f24136h = pVar;
        this.f24137i = obj;
    }

    abstract void C(Object obj);

    abstract Object D(Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.AbstractC1907Iw0
    protected final void m() {
        v(this.f24136h);
        this.f24136h = null;
        this.f24137i = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1907Iw0
    protected final String n() {
        String string;
        com.google.common.util.concurrent.p pVar = this.f24136h;
        Object obj = this.f24137i;
        String strN = super.n();
        if (pVar != null) {
            String string2 = pVar.toString();
            StringBuilder sb = new StringBuilder(string2.length() + 16);
            sb.append("inputFuture=[");
            sb.append(string2);
            sb.append("], ");
            string = sb.toString();
        } else {
            string = "";
        }
        if (obj == null) {
            if (strN != null) {
                return string.concat(strN);
            }
            return null;
        }
        int length = string.length();
        String string3 = obj.toString();
        StringBuilder sb2 = new StringBuilder(length + 10 + string3.length() + 1);
        sb2.append(string);
        sb2.append("function=[");
        sb2.append(string3);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.p pVar = this.f24136h;
        Object obj = this.f24137i;
        if ((isCancelled() | (pVar == null)) || (obj == null)) {
            return;
        }
        this.f24136h = null;
        if (pVar.isCancelled()) {
            u(pVar);
            return;
        }
        try {
            try {
                Object objD = D(obj, AbstractC5685wx0.s(pVar));
                this.f24137i = null;
                C(objD);
            } catch (Throwable th) {
                try {
                    AbstractC2324Qx0.a(th);
                    l(th);
                } finally {
                    this.f24137i = null;
                }
            }
        } catch (Error e10) {
            l(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            l(e11.getCause());
        } catch (Exception e12) {
            l(e12);
        }
    }
}
