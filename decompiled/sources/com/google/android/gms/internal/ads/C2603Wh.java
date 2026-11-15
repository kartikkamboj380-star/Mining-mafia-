package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2603Wh extends AbstractC2759Zh {
    C2603Wh(int i10, String str, Long l10, Long l11) {
        super(1, str, l10, l11, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2759Zh
    public final /* bridge */ /* synthetic */ Object a(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(e())) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(e()))) : (Long) f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2759Zh
    public final /* bridge */ /* synthetic */ void b(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(e(), ((Long) obj).longValue());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2759Zh
    public final /* bridge */ /* synthetic */ Object c(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(e(), ((Long) f()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2759Zh
    public final /* bridge */ /* synthetic */ Object d(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(e(), ((Long) f()).longValue()));
    }
}
