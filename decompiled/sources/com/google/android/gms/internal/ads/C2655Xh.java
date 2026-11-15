package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2655Xh extends AbstractC2759Zh {
    C2655Xh(int i10, String str, Float f10, Float f11) {
        super(1, str, f10, f11, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2759Zh
    public final /* bridge */ /* synthetic */ Object a(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(e())) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(e()))) : (Float) f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2759Zh
    public final /* bridge */ /* synthetic */ void b(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(e(), ((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2759Zh
    public final /* bridge */ /* synthetic */ Object c(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(e(), ((Float) f()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2759Zh
    public final /* bridge */ /* synthetic */ Object d(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(e(), ((Float) f()).floatValue()));
    }
}
