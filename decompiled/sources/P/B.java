package P;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f4639a;

    static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final B f4640a;

        a(B b10) {
            this.f4640a = b10;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            A aB = this.f4640a.b(i10);
            if (aB == null) {
                return null;
            }
            return aB.W0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i10) {
            List listC = this.f4640a.c(str, i10);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(((A) listC.get(i11)).W0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            A aD = this.f4640a.d(i10);
            if (aD == null) {
                return null;
            }
            return aD.W0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f4640a.f(i10, i11, bundle);
        }
    }

    static class b extends a {
        b(B b10) {
            super(b10);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f4640a.a(i10, A.X0(accessibilityNodeInfo), str, bundle);
        }
    }

    public B() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4639a = new b(this);
        } else {
            this.f4639a = new a(this);
        }
    }

    public A b(int i10) {
        return null;
    }

    public List c(String str, int i10) {
        return null;
    }

    public A d(int i10) {
        return null;
    }

    public Object e() {
        return this.f4639a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public B(Object obj) {
        this.f4639a = obj;
    }

    public void a(int i10, A a10, String str, Bundle bundle) {
    }
}
