package com.google.android.gms.internal.ads;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Tg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2446Tg0 implements InterfaceC2342Rg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2342Rg0 f23592a;

    public C2446Tg0(InterfaceC2342Rg0 interfaceC2342Rg0) {
        this.f23592a = interfaceC2342Rg0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2342Rg0
    public final JSONObject a(View view) {
        JSONObject jSONObjectB = AbstractC3137ch0.b(0, 0, 0, 0);
        int iB = AbstractC3514fh0.b();
        int i10 = iB - 1;
        if (iB == 0) {
            throw null;
        }
        try {
            jSONObjectB.put("noOutputDevice", i10 == 0);
            return jSONObjectB;
        } catch (JSONException e10) {
            AbstractC3263dh0.a("Error with setting output device status", e10);
            return jSONObjectB;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2342Rg0
    public final void b(View view, JSONObject jSONObject, InterfaceC2290Qg0 interfaceC2290Qg0, boolean z9, boolean z10) {
        ArrayList arrayList = new ArrayList();
        C1719Fg0 c1719Fg0A = C1719Fg0.a();
        if (c1719Fg0A != null) {
            Collection collectionF = c1719Fg0A.f();
            int size = collectionF.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionF.iterator();
            while (it.hasNext()) {
                View viewI = ((C4266lg0) it.next()).i();
                if (viewI != null && viewI.isAttachedToWindow() && viewI.isShown()) {
                    View view2 = viewI;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewI.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z11 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i10 = size2 - 1;
                                    if (((View) arrayList.get(i10)).getZ() <= z11) {
                                        break;
                                    } else {
                                        size2 = i10;
                                    }
                                }
                                arrayList.add(size2, rootView);
                                break;
                            }
                            break;
                        }
                        if (view2.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            break;
                        }
                        Object parent = view2.getParent();
                        view2 = parent instanceof View ? (View) parent : null;
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i11 = 0; i11 < size3; i11++) {
            interfaceC2290Qg0.a((View) arrayList.get(i11), this.f23592a, jSONObject, z10);
        }
    }
}
