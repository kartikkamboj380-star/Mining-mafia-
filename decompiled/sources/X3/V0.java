package X3;

import android.view.View;
import com.facebook.react.uimanager.AbstractC1359h;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: loaded from: classes2.dex */
public class V0 extends AbstractC1359h {
    public V0(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.AbstractC1359h, com.facebook.react.uimanager.U0
    public void a(View view, String str, Object obj) {
        str.getClass();
        if (str.equals("renderState")) {
            ((W0) this.f15703a).setRenderState(view, obj != null ? ((Double) obj).intValue() : 0);
        } else if (str.equals("initialHidden")) {
            ((W0) this.f15703a).setInitialHidden(view, obj != null ? ((Boolean) obj).booleanValue() : false);
        } else {
            super.a(view, str, obj);
        }
    }
}
