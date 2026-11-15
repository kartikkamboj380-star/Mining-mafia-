package X3;

import android.view.View;
import com.facebook.react.uimanager.AbstractC1359h;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: renamed from: X3.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1059t extends AbstractC1359h {
    public AbstractC1059t(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.AbstractC1359h, com.facebook.react.uimanager.U0
    public void a(View view, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "size":
                ((InterfaceC1061u) this.f15703a).setSize(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "color":
                ((InterfaceC1061u) this.f15703a).setColor(view, (String) obj);
                break;
            case "disabled":
                ((InterfaceC1061u) this.f15703a).setDisabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }
}
