package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import p147o6.G;

/* JADX INFO: loaded from: classes3.dex */
class c implements p087i6.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static c f40064e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.crashlytics.ndk.a f40065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f40066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f40067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f40068d;

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        void a();
    }

    c(com.google.firebase.crashlytics.ndk.a aVar, boolean z9) {
        this.f40065a = aVar;
        this.f40066b = z9;
    }

    public static /* synthetic */ void e(c cVar, String str, String str2, long j10, G g10) {
        cVar.getClass();
        p087i6.g.f().b("Initializing native session: " + str);
        if (cVar.f40065a.k(str, str2, j10, g10)) {
            return;
        }
        p087i6.g.f().k("Failed to initialize Crashlytics NDK for session " + str);
    }

    static c f(Context context, boolean z9) {
        c cVar = new c(new com.google.firebase.crashlytics.ndk.a(context, new JniNativeApi(context), new p177r6.g(context)), z9);
        f40064e = cVar;
        return cVar;
    }

    @Override // p087i6.a
    public p087i6.h a(String str) {
        return new g(this.f40065a.d(str));
    }

    @Override // p087i6.a
    public boolean b() {
        String str = this.f40067c;
        return str != null && c(str);
    }

    @Override // p087i6.a
    public boolean c(String str) {
        return this.f40065a.j(str);
    }

    @Override // p087i6.a
    public synchronized void d(final String str, final String str2, final long j10, final G g10) throws Throwable {
        try {
            try {
                this.f40067c = str;
                a aVar = new a() { // from class: com.google.firebase.crashlytics.ndk.b
                    @Override // com.google.firebase.crashlytics.ndk.c.a
                    public final void a() {
                        c.e(this.f40059a, str, str2, j10, g10);
                    }
                };
                this.f40068d = aVar;
                if (this.f40066b) {
                    aVar.a();
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
