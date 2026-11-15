package L4;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t {
    public static Object a(Context context, String str, r rVar) throws s {
        try {
            return rVar.zza(c(context).d(str));
        } catch (Exception e10) {
            throw new s(e10);
        }
    }

    public static Context b(Context context) {
        return c(context).b();
    }

    private static DynamiteModule c(Context context) throws s {
        try {
            return DynamiteModule.e(context, DynamiteModule.f17195b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e10) {
            throw new s(e10);
        }
    }
}
