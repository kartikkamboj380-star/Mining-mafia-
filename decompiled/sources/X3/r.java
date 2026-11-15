package X3;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1359h;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: loaded from: classes2.dex */
public class r extends AbstractC1359h {
    public r(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.AbstractC1359h, com.facebook.react.uimanager.U0
    public void a(View view, String str, Object obj) {
        str.getClass();
        if (str.equals("responseId")) {
            ((InterfaceC1057s) this.f15703a).setResponseId(view, obj == null ? null : (String) obj);
        } else {
            super.a(view, str, obj);
        }
    }

    @Override // com.facebook.react.uimanager.AbstractC1359h, com.facebook.react.uimanager.U0
    public void b(View view, String str, ReadableArray readableArray) {
        str.getClass();
        if (str.equals("registerAsset")) {
            ((InterfaceC1057s) this.f15703a).registerAsset(view, readableArray.getString(0), readableArray.getInt(1));
        }
    }
}
