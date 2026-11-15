package W5;

import W5.b;
import W5.e;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzbq;
import com.google.android.gms.internal.consent_sdk.zzcz;
import java.util.Objects;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    public interface a {
        void onConsentFormLoadFailure(e eVar);
    }

    public interface b {
        void onConsentFormLoadSuccess(W5.b bVar);
    }

    public static c a(Context context) {
        return zza.zza(context).zzb();
    }

    public static void b(final Activity activity, final W5.b.a aVar) {
        zza zzaVarZza = zza.zza(activity);
        if (zzaVarZza.zzb().canRequestAds()) {
            aVar.a(null);
            return;
        }
        zzaVarZza.zzd().zzc();
        zzbq zzbqVarZzc = zzaVarZza.zzc();
        zzcz.zza();
        b bVar = new b() { // from class: com.google.android.gms.internal.consent_sdk.zzbo
            @Override // W5.f.b
            public final void onConsentFormLoadSuccess(b bVar2) {
                bVar2.show(activity, aVar);
            }
        };
        Objects.requireNonNull(aVar);
        zzbqVarZzc.zzb(bVar, new a() { // from class: com.google.android.gms.internal.consent_sdk.zzbp
            @Override // W5.f.a
            public final void onConsentFormLoadFailure(e eVar) {
                aVar.a(eVar);
            }
        }, true);
    }

    public static void c(Context context, b bVar, a aVar) {
        zza zzaVarZza = zza.zza(context);
        ((Queue) zzaVarZza.zzd().zzb.get()).add(Long.valueOf(System.currentTimeMillis()));
        zzaVarZza.zzc().zzb(bVar, aVar, false);
    }

    public static void d(Activity activity, W5.b.a aVar) {
        zza.zza(activity).zzc().zze(activity, aVar);
    }
}
