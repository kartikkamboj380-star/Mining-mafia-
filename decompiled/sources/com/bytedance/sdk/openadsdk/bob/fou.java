package com.bytedance.sdk.openadsdk.bob;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.uml;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.utils.bss;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class fou extends TTDislikeDialogAbstract {
    private String csi;
    private kq fou;

    public interface kq {
        void kq();

        void kq(int i10, FilterWord filterWord);

        void oq();
    }

    public fou(Context context, String str, List<FilterWord> list) {
        super(context, uml.rhi(context, "tt_dislikeDialog"));
        this.kq = str;
        this.oq = list;
    }

    private void oq() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.bob.fou.1
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                if (fou.this.fou != null) {
                    kq unused = fou.this.fou;
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.bob.fou.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (fou.this.fou != null) {
                    fou.this.fou.oq();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(bss.bob(getContext()) - 120, -2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public View getLayoutView() {
        return new dgq(getContext(), this.bob, this.oq);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            setCanceledOnTouchOutside(true);
            setCancelable(true);
            kq();
            oq();
            setMaterialMeta(this.kq, this.oq);
        } catch (Throwable unused) {
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public void kq(kq kqVar) {
        this.fou = kqVar;
    }

    public void kq(String str) {
        this.csi = str;
    }

    @Override // com.bytedance.sdk.openadsdk.bob.nn.oq
    public void kq(int i10) {
        FilterWord filterWordOq;
        if (nn.bob == i10) {
            dismiss();
            return;
        }
        if (nn.csi == i10) {
            kq kqVar = this.fou;
            if (kqVar != null) {
                kqVar.kq();
                return;
            }
            return;
        }
        if (nn.oq != i10 || (filterWordOq = this.bob.oq()) == null || nn.kq.equals(filterWordOq)) {
            return;
        }
        kq kqVar2 = this.fou;
        if (kqVar2 != null) {
            try {
                kqVar2.kq(0, filterWordOq);
            } catch (Throwable unused) {
            }
        }
        dismiss();
    }

    private void kq() {
        Window window = getWindow();
        if (window == null || window.getAttributes() == null) {
            return;
        }
        window.getAttributes().windowAnimations = 0;
    }
}
