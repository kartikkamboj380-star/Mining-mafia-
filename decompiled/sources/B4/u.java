package B4;

import H4.C0654z;
import H4.InterfaceC0582a1;
import H4.q2;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0582a1 f272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f273b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f274c;

    private u(InterfaceC0582a1 interfaceC0582a1) {
        this.f272a = interfaceC0582a1;
        if (interfaceC0582a1 != null) {
            try {
                List listZzg = interfaceC0582a1.zzg();
                if (listZzg != null) {
                    Iterator it = listZzg.iterator();
                    while (it.hasNext()) {
                        i iVarE = i.e((q2) it.next());
                        if (iVarE != null) {
                            this.f273b.add(iVarE);
                        }
                    }
                }
            } catch (RemoteException e10) {
                L4.p.d("Could not forward getAdapterResponseInfo to ResponseInfo.", e10);
            }
        }
        InterfaceC0582a1 interfaceC0582a2 = this.f272a;
        if (interfaceC0582a2 == null) {
            return;
        }
        try {
            q2 q2VarC = interfaceC0582a2.c();
            if (q2VarC != null) {
                this.f274c = i.e(q2VarC);
            }
        } catch (RemoteException e11) {
            L4.p.d("Could not forward getLoadedAdapterResponse to ResponseInfo.", e11);
        }
    }

    public static u e(InterfaceC0582a1 interfaceC0582a1) {
        if (interfaceC0582a1 != null) {
            return new u(interfaceC0582a1);
        }
        return null;
    }

    public static u f(InterfaceC0582a1 interfaceC0582a1) {
        return new u(interfaceC0582a1);
    }

    public String a() {
        try {
            InterfaceC0582a1 interfaceC0582a1 = this.f272a;
            if (interfaceC0582a1 != null) {
                return interfaceC0582a1.zze();
            }
            return null;
        } catch (RemoteException e10) {
            L4.p.d("Could not forward getMediationAdapterClassName to ResponseInfo.", e10);
            return null;
        }
    }

    public Bundle b() {
        try {
            InterfaceC0582a1 interfaceC0582a1 = this.f272a;
            if (interfaceC0582a1 != null) {
                return interfaceC0582a1.zzi();
            }
        } catch (RemoteException e10) {
            L4.p.d("Could not forward getResponseExtras to ResponseInfo.", e10);
        }
        return new Bundle();
    }

    public String c() {
        try {
            InterfaceC0582a1 interfaceC0582a1 = this.f272a;
            if (interfaceC0582a1 != null) {
                return interfaceC0582a1.b();
            }
            return null;
        } catch (RemoteException e10) {
            L4.p.d("Could not forward getResponseId to ResponseInfo.", e10);
            return null;
        }
    }

    public final JSONObject d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String strC = c();
        if (strC == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", strC);
        }
        String strA = a();
        if (strA == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", strA);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f273b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((i) it.next()).f());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        i iVar = this.f274c;
        if (iVar != null) {
            jSONObject.put("Loaded Adapter Response", iVar.f());
        }
        Bundle bundleB = b();
        if (bundleB != null) {
            jSONObject.put("Response Extras", C0654z.a().v(bundleB));
        }
        return jSONObject;
    }

    public final InterfaceC0582a1 g() {
        return this.f272a;
    }

    public String toString() {
        try {
            return d().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
