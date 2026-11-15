package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractRunnableC1543Bw0 extends AbstractC4552nx0 implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f17744k = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    com.google.common.util.concurrent.p f17745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Class f17746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Object f17747j;

    AbstractRunnableC1543Bw0(com.google.common.util.concurrent.p pVar, Class cls, Object obj) {
        pVar.getClass();
        this.f17745h = pVar;
        this.f17746i = cls;
        this.f17747j = obj;
    }

    abstract void C(Object obj);

    abstract Object D(Object obj, Throwable th);

    @Override // com.google.android.gms.internal.ads.AbstractC1907Iw0
    protected final void m() {
        v(this.f17745h);
        this.f17745h = null;
        this.f17746i = null;
        this.f17747j = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1907Iw0
    protected final String n() {
        String string;
        com.google.common.util.concurrent.p pVar = this.f17745h;
        Class cls = this.f17746i;
        Object obj = this.f17747j;
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
        if (cls == null || obj == null) {
            if (strN != null) {
                return string.concat(strN);
            }
            return null;
        }
        int length = string.length();
        String string3 = cls.toString();
        int length2 = string3.length();
        String string4 = obj.toString();
        StringBuilder sb2 = new StringBuilder(length + 15 + length2 + 13 + string4.length() + 1);
        sb2.append(string);
        sb2.append("exceptionType=[");
        sb2.append(string3);
        sb2.append("], fallback=[");
        sb2.append(string4);
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object objS;
        com.google.common.util.concurrent.p pVar = this.f17745h;
        Class cls = this.f17746i;
        Object obj = this.f17747j;
        if (((obj == null) || ((pVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.f17745h = null;
        try {
            th = pVar instanceof AbstractC2920ay0 ? ((AbstractC2920ay0) pVar).a() : null;
            objS = th == null ? AbstractC5685wx0.s(pVar) : null;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(pVar.getClass());
                String strValueOf2 = String.valueOf(e10.getClass());
                StringBuilder sb = new StringBuilder(strValueOf.length() + 19 + strValueOf2.length() + 16);
                sb.append("Future type ");
                sb.append(strValueOf);
                sb.append(" threw ");
                sb.append(strValueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            k(objS);
            return;
        }
        if (!cls.isInstance(th)) {
            u(pVar);
            return;
        }
        try {
            Object objD = D(obj, th);
            this.f17746i = null;
            this.f17747j = null;
            C(objD);
        } catch (Throwable th2) {
            try {
                AbstractC2324Qx0.a(th2);
                l(th2);
            } finally {
                this.f17746i = null;
                this.f17747j = null;
            }
        }
    }
}
