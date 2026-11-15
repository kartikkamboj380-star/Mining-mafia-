package X3;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1359h;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: renamed from: X3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1038i extends AbstractC1359h {
    public C1038i(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.AbstractC1359h, com.facebook.react.uimanager.U0
    public void a(View view, String str, Object obj) {
        super.a(view, str, obj);
    }

    @Override // com.facebook.react.uimanager.AbstractC1359h, com.facebook.react.uimanager.U0
    public void b(View view, String str, ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "clearElementsHighlights":
                ((InterfaceC1040j) this.f15703a).clearElementsHighlights(view);
                break;
            case "highlightTraceUpdates":
                ((InterfaceC1040j) this.f15703a).highlightTraceUpdates(view, readableArray.getArray(0));
                break;
            case "highlightElements":
                ((InterfaceC1040j) this.f15703a).highlightElements(view, readableArray.getArray(0));
                break;
        }
    }
}
