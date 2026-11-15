package p188s7;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p158p7.l;
import p208u7.e;
import p208u7.h;

/* JADX INFO: loaded from: classes3.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f49356a;

    public c(a aVar) {
        this.f49356a = aVar;
    }

    @Override // p188s7.a
    public JSONObject a(View view) {
        JSONObject jSONObjectB = p208u7.c.b(0, 0, 0, 0);
        p208u7.c.i(jSONObjectB, e.a());
        return jSONObjectB;
    }

    ArrayList b() {
        View rootView;
        ArrayList arrayList = new ArrayList();
        p178r7.c cVarE = p178r7.c.e();
        if (cVarE != null) {
            Collection collectionA = cVarE.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionA.size() * 2) + 3);
            Iterator it = collectionA.iterator();
            while (it.hasNext()) {
                View viewH = ((l) it.next()).h();
                if (viewH != null && h.e(viewH) && (rootView = viewH.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fC = h.c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.c((View) arrayList.get(size - 1)) > fC) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // p188s7.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0532a interfaceC0532a, boolean z9, boolean z10) {
        ArrayList arrayListB = b();
        int size = arrayListB.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListB.get(i10);
            i10++;
            interfaceC0532a.a((View) obj, this.f49356a, jSONObject, z10);
        }
    }
}
