package p051f0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.e;
import com.google.android.gms.common.api.Api;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class g implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EditText f43550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f43551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e.f f43552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f43553d = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f43554e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f43555f = true;

    private static class a extends e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference f43556a;

        a(EditText editText) {
            this.f43556a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            super.b();
            g.b((EditText) this.f43556a.get(), 1);
        }
    }

    g(EditText editText, boolean z9) {
        this.f43550a = editText;
        this.f43551b = z9;
    }

    private e.f a() {
        if (this.f43552c == null) {
            this.f43552c = new a(this.f43550a);
        }
        return this.f43552c;
    }

    static void b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            e.c().p(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        if (this.f43555f) {
            return (this.f43551b || e.i()) ? false : true;
        }
        return true;
    }

    public void c(boolean z9) {
        if (this.f43555f != z9) {
            if (this.f43552c != null) {
                e.c().u(this.f43552c);
            }
            this.f43555f = z9;
            if (z9) {
                b(this.f43550a, e.c().e());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f43550a.isInEditMode() || d() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iE = e.c().e();
        if (iE != 0) {
            if (iE == 1) {
                e.c().s((Spannable) charSequence, i10, i10 + i12, this.f43553d, this.f43554e);
                return;
            } else if (iE != 3) {
                return;
            }
        }
        e.c().t(a());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
