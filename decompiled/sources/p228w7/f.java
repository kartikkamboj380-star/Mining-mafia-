package p228w7;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;
import p158p7.l;
import p178r7.c;

/* JADX INFO: loaded from: classes3.dex */
public class f extends a {
    public f(b.InterfaceC0555b interfaceC0555b, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0555b, hashSet, jSONObject, j10);
    }

    private void e(String str) {
        c cVarE = c.e();
        if (cVarE != null) {
            for (l lVar : cVarE.c()) {
                if (this.f50384c.contains(lVar.o())) {
                    lVar.p().m(str, this.f50386e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p228w7.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            e(str);
        }
        super.onPostExecute(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (p208u7.c.u(this.f50385d, this.f50388b.a())) {
            return null;
        }
        this.f50388b.a(this.f50385d);
        return this.f50385d.toString();
    }
}
