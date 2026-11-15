package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.th0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class AsyncTaskC5275th0 extends AbstractAsyncTaskC4772ph0 {
    public AsyncTaskC5275th0(C4142kh0 c4142kh0, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(c4142kh0, hashSet, jSONObject, j10);
    }

    private final void c(String str) {
        C1719Fg0 c1719Fg0A = C1719Fg0.a();
        if (c1719Fg0A != null) {
            for (C4266lg0 c4266lg0 : c1719Fg0A.e()) {
                if (this.f32453c.contains(c4266lg0.h())) {
                    c4266lg0.g().i(str, this.f32455e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC4898qh0
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        c(str);
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f32454d.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC4898qh0, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        c(str);
        super.onPostExecute(str);
    }
}
