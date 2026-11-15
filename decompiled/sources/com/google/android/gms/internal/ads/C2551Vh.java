package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2551Vh extends AbstractC2759Zh {
    C2551Vh(int i10, String str, Integer num, Integer num2) {
        super(1, str, num, num2, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2759Zh
    public final /* bridge */ /* synthetic */ Object a(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(e())) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(e()))) : (Integer) f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2759Zh
    public final /* bridge */ /* synthetic */ void b(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(e(), ((Integer) obj).intValue());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2759Zh
    public final /* bridge */ /* synthetic */ Object c(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(e(), ((Integer) f()).intValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2759Zh
    public final /* bridge */ /* synthetic */ Object d(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(e(), ((Integer) f()).intValue()));
    }
}
