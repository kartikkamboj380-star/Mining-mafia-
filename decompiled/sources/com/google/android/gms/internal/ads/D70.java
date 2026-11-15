package com.google.android.gms.internal.ads;

import H4.C0654z;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class D70 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f18091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f18092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f18093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f18094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f18095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f18096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C5424ut f18097g;

    D70(C5424ut c5424ut, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10, boolean z9, boolean z10) {
        this.f18097g = c5424ut;
        this.f18091a = context;
        this.f18092b = scheduledExecutorService;
        this.f18093c = executor;
        this.f18094d = i10;
        this.f18095e = z9;
        this.f18096f = z10;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final /* synthetic */ E70 a(AdvertisingIdClient.Info info) {
        C3269dk0 c3269dk0 = new C3269dk0();
        if (this.f18095e) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29733X3)).booleanValue()) {
                Context context = this.f18091a;
                C3772hk0 c3772hk0I = C3772hk0.i(context);
                Objects.requireNonNull(info);
                String id = info.getId();
                Objects.requireNonNull(id);
                c3269dk0 = c3772hk0I.k(id, context.getPackageName(), ((Long) H4.B.c().d(AbstractC3892ii.f29786c4)).longValue(), this.f18096f);
            }
        } else {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29723W3)).booleanValue()) {
                try {
                    Context context2 = this.f18091a;
                    C3772hk0 c3772hk0I2 = C3772hk0.i(context2);
                    Objects.requireNonNull(info);
                    String id2 = info.getId();
                    Objects.requireNonNull(id2);
                    c3269dk0 = c3772hk0I2.k(id2, context2.getPackageName(), ((Long) H4.B.c().d(AbstractC3892ii.f29786c4)).longValue(), this.f18096f);
                } catch (IOException | IllegalArgumentException e10) {
                    G4.t.l().j(e10, "AdIdInfoSignalSource.getPaidV1");
                    c3269dk0 = new C3269dk0();
                }
            }
        }
        return new E70(info, null, c3269dk0);
    }

    final /* synthetic */ E70 b(Throwable th) {
        C0654z.a();
        ContentResolver contentResolver = this.f18091a.getContentResolver();
        return new E70(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new C3269dk0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        AbstractC4678ox0 abstractC4678ox0B = AbstractC4678ox0.B(this.f18097g.a(this.f18091a, this.f18094d));
        InterfaceC1899Is0 interfaceC1899Is0 = new InterfaceC1899Is0() { // from class: com.google.android.gms.internal.ads.C70
            @Override // com.google.android.gms.internal.ads.InterfaceC1899Is0
            public final /* synthetic */ Object apply(Object obj) {
                return this.f17810a.a((AdvertisingIdClient.Info) obj);
            }
        };
        Executor executor = this.f18093c;
        return (AbstractC4678ox0) AbstractC5685wx0.g((AbstractC4678ox0) AbstractC5685wx0.i((AbstractC4678ox0) AbstractC5685wx0.k(abstractC4678ox0B, interfaceC1899Is0, executor), ((Long) H4.B.c().d(AbstractC3892ii.f29521C1)).longValue(), TimeUnit.MILLISECONDS, this.f18092b), Throwable.class, new InterfaceC1899Is0() { // from class: com.google.android.gms.internal.ads.B70
            @Override // com.google.android.gms.internal.ads.InterfaceC1899Is0
            public final /* synthetic */ Object apply(Object obj) {
                return this.f17502a.b((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 40;
    }
}
