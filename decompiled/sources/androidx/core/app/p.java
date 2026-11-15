package androidx.core.app;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f9244a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f9245b = new Object();

    static Bundle a(n.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = aVar.d();
        bundle.putInt("icon", iconCompatD != null ? iconCompatD.f() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(x xVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", xVar.i());
        bundle.putCharSequence("label", xVar.h());
        bundle.putCharSequenceArray("choices", xVar.e());
        bundle.putBoolean("allowFreeFormInput", xVar.c());
        bundle.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, xVar.g());
        Set setD = xVar.d();
        if (setD != null && !setD.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setD.size());
            Iterator it = setD.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] c(x[] xVarArr) {
        if (xVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[xVarArr.length];
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            bundleArr[i10] = b(xVarArr[i10]);
        }
        return bundleArr;
    }
}
