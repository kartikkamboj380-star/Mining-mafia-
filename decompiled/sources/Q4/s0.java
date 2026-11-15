package Q4;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.AK;
import com.google.android.gms.internal.ads.JR;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 implements AK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JR f4988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r0 f4989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4991d;

    public s0(JR jr, r0 r0Var, String str, int i10) {
        this.f4988a = jr;
        this.f4989b = r0Var;
        this.f4990c = str;
        this.f4991d = i10;
    }

    @Override // com.google.android.gms.internal.ads.AK
    public final void a(M m10) {
        String strOptString;
        if (m10 == null || this.f4991d == 2) {
            return;
        }
        if (TextUtils.isEmpty(m10.f4846c)) {
            this.f4989b.a(this.f4990c, m10.f4845b, this.f4988a);
            return;
        }
        try {
            strOptString = new JSONObject(m10.f4846c).optString("request_id");
        } catch (JSONException e10) {
            G4.t.l().j(e10, "RenderSignals.getRequestId");
            strOptString = null;
        }
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.f4989b.a(strOptString, m10.f4846c, this.f4988a);
    }

    @Override // com.google.android.gms.internal.ads.AK
    public final void k(String str) {
    }
}
