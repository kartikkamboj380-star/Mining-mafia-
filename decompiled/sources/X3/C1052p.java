package X3;

import android.view.View;
import com.facebook.react.uimanager.AbstractC1359h;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: renamed from: X3.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1052p extends AbstractC1359h {
    public C1052p(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.AbstractC1359h, com.facebook.react.uimanager.U0
    public void a(View view, String str, Object obj) {
        str.getClass();
        if (str.equals("responseId")) {
            ((InterfaceC1054q) this.f15703a).setResponseId(view, obj != null ? (String) obj : null);
        } else if (str.equals("resizeMode")) {
            ((InterfaceC1054q) this.f15703a).setResizeMode(view, obj != null ? (String) obj : null);
        } else {
            super.a(view, str, obj);
        }
    }
}
