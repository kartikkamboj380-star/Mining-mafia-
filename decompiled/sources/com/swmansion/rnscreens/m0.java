package com.swmansion.rnscreens;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SearchView f42480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f42481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f42482c;

    public m0(SearchView searchView) {
        Intrinsics.checkNotNullParameter(searchView, "searchView");
        this.f42480a = searchView;
    }

    private final ImageView a() {
        return (ImageView) this.f42480a.findViewById(p060g.f.f43988y);
    }

    private final EditText b() {
        View viewFindViewById = this.f42480a.findViewById(p060g.f.f43951D);
        if (viewFindViewById instanceof EditText) {
            return (EditText) viewFindViewById;
        }
        return null;
    }

    private final ImageView c() {
        return (ImageView) this.f42480a.findViewById(p060g.f.f43987x);
    }

    private final View d() {
        return this.f42480a.findViewById(p060g.f.f43950C);
    }

    public final void e(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            c().setColorFilter(iIntValue);
            a().setColorFilter(iIntValue);
        }
    }

    public final void f(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            EditText editTextB = b();
            if (editTextB != null) {
                editTextB.setHintTextColor(iIntValue);
            }
        }
    }

    public final void g(String placeholder, boolean z9) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        if (z9) {
            this.f42480a.setQueryHint(placeholder);
            return;
        }
        EditText editTextB = b();
        if (editTextB != null) {
            editTextB.setHint(placeholder);
        }
    }

    public final void h(Integer num) {
        EditText editTextB;
        ColorStateList textColors;
        Integer num2 = this.f42481b;
        if (num == null) {
            if (num2 == null || (editTextB = b()) == null) {
                return;
            }
            editTextB.setTextColor(num2.intValue());
            return;
        }
        if (num2 == null) {
            EditText editTextB2 = b();
            this.f42481b = (editTextB2 == null || (textColors = editTextB2.getTextColors()) == null) ? null : Integer.valueOf(textColors.getDefaultColor());
        }
        EditText editTextB3 = b();
        if (editTextB3 != null) {
            editTextB3.setTextColor(num.intValue());
        }
    }

    public final void i(Integer num) {
        Drawable drawable = this.f42482c;
        if (num != null) {
            if (drawable == null) {
                this.f42482c = d().getBackground();
            }
            d().setBackgroundColor(num.intValue());
        } else if (drawable != null) {
            d().setBackground(drawable);
        }
    }
}
