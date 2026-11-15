package K4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC1743Fs0;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.C3772hk0;
import com.google.android.gms.internal.ads.C3790ht0;
import com.google.android.gms.internal.ads.C3897ik0;
import com.google.android.gms.internal.ads.C4022jk0;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: K4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0763d {
    public static void a(Context context) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29822f7)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            C3772hk0 c3772hk0I = C3772hk0.i(context);
            C3897ik0 c3897ik0I = C3897ik0.i(context);
            C4022jk0 c4022jk0A = C4022jk0.a(context);
            c3772hk0I.l();
            c3772hk0I.m();
            c3897ik0I.k();
            c4022jk0A.b(null);
        } catch (IOException e10) {
            G4.t.l().j(e10, "clearStorageOnIdlessMode");
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
            } else {
                throw new IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (IOException e11) {
            G4.t.l().j(e11, "clearStorageOnIdlessMode_scar");
        }
    }

    public static Bundle b(Context context, String str) {
        JSONArray jSONArray;
        int i10;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e10) {
                int i11 = AbstractC0786o0.f2696b;
                L4.p.b("JSON parsing error", e10);
                jSONArray = null;
            }
        }
        if (jSONArray == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i12);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt(HandleInvocationsFromAdViewer.KEY_AD_TYPE, -1);
            if (iOptInt == 0) {
                i10 = 1;
            } else if (iOptInt != 1) {
                i10 = iOptInt != 2 ? 0 : 3;
            } else {
                i10 = 2;
            }
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i10 != 0) {
                List listE = C3790ht0.a(AbstractC1743Fs0.b('/')).e(strOptString2);
                if (listE.size() > 2 || listE.isEmpty()) {
                    obj = null;
                } else {
                    if (listE.size() == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (String) listE.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((String) listE.get(0), 0);
                        str2 = (String) listE.get(1);
                    }
                    obj = sharedPreferences.getAll().get(str2);
                }
                if (obj != null) {
                    int i13 = i10 - 1;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    public static Bundle c(Context context, String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return b(context, str);
    }
}
