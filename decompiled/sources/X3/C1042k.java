package X3;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1359h;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: renamed from: X3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1042k extends AbstractC1359h {
    public C1042k(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.AbstractC1359h, com.facebook.react.uimanager.U0
    public void a(View view, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "presentationStyle":
                ((InterfaceC1044l) this.f15703a).setPresentationStyle(view, (String) obj);
                break;
            case "supportedOrientations":
                ((InterfaceC1044l) this.f15703a).setSupportedOrientations(view, (ReadableArray) obj);
                break;
            case "transparent":
                ((InterfaceC1044l) this.f15703a).setTransparent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "identifier":
                ((InterfaceC1044l) this.f15703a).setIdentifier(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "statusBarTranslucent":
                ((InterfaceC1044l) this.f15703a).setStatusBarTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "allowSwipeDismissal":
                ((InterfaceC1044l) this.f15703a).setAllowSwipeDismissal(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "animated":
                ((InterfaceC1044l) this.f15703a).setAnimated(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "visible":
                ((InterfaceC1044l) this.f15703a).setVisible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "navigationBarTranslucent":
                ((InterfaceC1044l) this.f15703a).setNavigationBarTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "hardwareAccelerated":
                ((InterfaceC1044l) this.f15703a).setHardwareAccelerated(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "animationType":
                ((InterfaceC1044l) this.f15703a).setAnimationType(view, (String) obj);
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }
}
