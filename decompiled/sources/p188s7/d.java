package p188s7;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;
import p208u7.c;

/* JADX INFO: loaded from: classes3.dex */
public class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f49357a = new int[2];

    private void b(ViewGroup viewGroup, JSONObject jSONObject, a.InterfaceC0532a interfaceC0532a, boolean z9) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            interfaceC0532a.a(viewGroup.getChildAt(i10), this, jSONObject, z9);
        }
    }

    private void c(ViewGroup viewGroup, JSONObject jSONObject, a.InterfaceC0532a interfaceC0532a, boolean z9) {
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(map.keySet());
        Collections.sort(arrayList2);
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            ArrayList arrayList3 = (ArrayList) map.get((Float) obj);
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList3.get(i12);
                i12++;
                interfaceC0532a.a((View) obj2, this, jSONObject, z9);
            }
        }
    }

    @Override // p188s7.a
    public JSONObject a(View view) {
        if (view == null) {
            return c.b(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f49357a);
        int[] iArr = this.f49357a;
        return c.b(iArr[0], iArr[1], width, height);
    }

    @Override // p188s7.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0532a interfaceC0532a, boolean z9, boolean z10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z9) {
                c(viewGroup, jSONObject, interfaceC0532a, z10);
            } else {
                b(viewGroup, jSONObject, interfaceC0532a, z10);
            }
        }
    }
}
