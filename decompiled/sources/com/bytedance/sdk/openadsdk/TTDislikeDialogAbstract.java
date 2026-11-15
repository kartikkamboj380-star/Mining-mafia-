package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.bob.nn;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class TTDislikeDialogAbstract extends Dialog implements nn.oq {
    protected final nn bob;
    private View fou;
    protected String kq;
    protected List<FilterWord> oq;

    public TTDislikeDialogAbstract(@NonNull Context context) {
        super(context);
        nn nnVar = new nn();
        this.bob = nnVar;
        nnVar.kq(this);
    }

    public void destroy() {
        nn nnVar = this.bob;
        if (nnVar != null) {
            nnVar.kq();
        }
    }

    public nn getDislikeManager() {
        return this.bob;
    }

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.fou = getLayoutView();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        View view = this.fou;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        setContentView(view, layoutParams);
    }

    public void onSuggestionSubmit(String str) {
        nn nnVar = this.bob;
        if (nnVar != null) {
            nnVar.bob(str);
        }
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.kq = str;
        this.oq = list;
        this.bob.kq(str);
        this.bob.kq(this.oq);
    }

    public TTDislikeDialogAbstract(@NonNull Context context, int i10) {
        super(context, i10);
        nn nnVar = new nn();
        this.bob = nnVar;
        nnVar.kq(this);
    }
}
