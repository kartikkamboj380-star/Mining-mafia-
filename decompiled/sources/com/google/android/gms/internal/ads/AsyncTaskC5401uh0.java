package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class AsyncTaskC5401uh0 extends AbstractAsyncTaskC4772ph0 {
    public AsyncTaskC5401uh0(C4142kh0 c4142kh0, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(c4142kh0, hashSet, jSONObject, j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC4898qh0
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        C1719Fg0 c1719Fg0A;
        if (!TextUtils.isEmpty(str) && (c1719Fg0A = C1719Fg0.a()) != null) {
            for (C4266lg0 c4266lg0 : c1719Fg0A.e()) {
                if (this.f32453c.contains(c4266lg0.h())) {
                    c4266lg0.g().h(str, this.f32455e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        C4142kh0 c4142kh0 = this.f32707b;
        JSONObject jSONObject = this.f32454d;
        if (AbstractC3137ch0.g(jSONObject, c4142kh0.d())) {
            return null;
        }
        c4142kh0.e(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC4898qh0, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
