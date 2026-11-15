package p228w7;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f50387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final InterfaceC0555b f50388b;

    public interface a {
        void a(b bVar);
    }

    /* JADX INFO: renamed from: w7.b$b, reason: collision with other inner class name */
    public interface InterfaceC0555b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0555b interfaceC0555b) {
        this.f50388b = interfaceC0555b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f50387a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void b(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }

    public void c(a aVar) {
        this.f50387a = aVar;
    }
}
