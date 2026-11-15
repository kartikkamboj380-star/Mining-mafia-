package com.bytedance.sdk.openadsdk.uml;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    private final String bob;
    private SharedPreferences kq;
    private final Context oq;

    public oq(Context context, String str) {
        this.oq = context;
        this.bob = str;
    }

    private SharedPreferences oq() {
        Context context;
        SharedPreferences sharedPreferences = this.kq;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        if (TextUtils.isEmpty(this.bob) || (context = this.oq) == null) {
            return null;
        }
        try {
            this.kq = context.getSharedPreferences(this.bob, 0);
        } catch (Throwable th) {
            Log.e("SPUnit", th.getMessage());
        }
        return this.kq;
    }

    public void kq(JSONObject jSONObject) {
        try {
            SharedPreferences sharedPreferencesOq = oq();
            if (sharedPreferencesOq != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesOq.edit();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        if (!TextUtils.isEmpty(next)) {
                            Object obj = jSONObject.get(next);
                            if (obj instanceof Integer) {
                                editorEdit.putInt(next, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                editorEdit.putLong(next, ((Long) obj).longValue());
                            } else if (obj instanceof String) {
                                editorEdit.putString(next, (String) obj);
                            } else if (obj instanceof Boolean) {
                                editorEdit.putBoolean(next, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Float) {
                                editorEdit.putFloat(next, ((Float) obj).floatValue());
                            } else if (obj instanceof Double) {
                                Double d10 = (Double) obj;
                                d10.doubleValue();
                                editorEdit.putFloat(next, d10.floatValue());
                            }
                        }
                    } catch (Throwable th) {
                        Log.e("SPUnit", th.getMessage());
                    }
                }
                editorEdit.apply();
            }
        } catch (Throwable th2) {
            Log.e("SPUnit", th2.getMessage());
        }
    }

    public long oq(String str, long j10) {
        try {
            SharedPreferences sharedPreferencesOq = oq();
            if (sharedPreferencesOq != null && sharedPreferencesOq.contains(str)) {
                return sharedPreferencesOq.getLong(str, j10);
            }
            return j10;
        } catch (Throwable th) {
            Log.i("SPUnit", this.bob + th.getMessage());
            return j10;
        }
    }

    public void kq(String str, long j10) {
        try {
            SharedPreferences sharedPreferencesOq = oq();
            if (sharedPreferencesOq != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesOq.edit();
                editorEdit.putLong(str, j10);
                editorEdit.apply();
            }
        } catch (Throwable th) {
            Log.e("SPUnit", th.getMessage());
        }
    }

    public int kq(String str, int i10) {
        try {
            SharedPreferences sharedPreferencesOq = oq();
            if (sharedPreferencesOq != null && sharedPreferencesOq.contains(str)) {
                return sharedPreferencesOq.getInt(str, i10);
            }
            return i10;
        } catch (Throwable th) {
            Log.i("SPUnit", this.bob + th.getMessage());
            return i10;
        }
    }

    public String kq(String str, String str2) {
        try {
            SharedPreferences sharedPreferencesOq = oq();
            if (sharedPreferencesOq != null && sharedPreferencesOq.contains(str)) {
                return sharedPreferencesOq.getString(str, str2);
            }
            return str2;
        } catch (Throwable th) {
            Log.i("SPUnit", this.bob + th.getMessage());
            return str2;
        }
    }

    public boolean kq(String str, boolean z9) {
        try {
            SharedPreferences sharedPreferencesOq = oq();
            if (sharedPreferencesOq != null && sharedPreferencesOq.contains(str)) {
                return sharedPreferencesOq.getBoolean(str, z9);
            }
            return z9;
        } catch (Throwable th) {
            Log.i("SPUnit", this.bob + th.getMessage());
            return z9;
        }
    }

    public void kq() {
        SharedPreferences sharedPreferencesOq = oq();
        if (sharedPreferencesOq != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesOq.edit();
            editorEdit.clear();
            editorEdit.commit();
        }
    }
}
