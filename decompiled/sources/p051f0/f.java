package p051f0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.e;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f43545a;

    private static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextView f43546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f43547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f43548c = true;

        a(TextView textView) {
            this.f43546a = textView;
            this.f43547b = new d(textView);
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f43547b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f43547b;
            return inputFilterArr2;
        }

        private SparseArray g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray sparseArrayG = g(inputFilterArr);
            if (sparseArrayG.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayG.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArrayG.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void k() {
            this.f43546a.setFilters(a(this.f43546a.getFilters()));
        }

        private TransformationMethod m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        @Override // f0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f43548c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // f0.f.b
        public boolean b() {
            return this.f43548c;
        }

        @Override // f0.f.b
        void c(boolean z9) {
            if (z9) {
                l();
            }
        }

        @Override // f0.f.b
        void d(boolean z9) {
            this.f43548c = z9;
            l();
            k();
        }

        @Override // f0.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f43548c ? m(transformationMethod) : j(transformationMethod);
        }

        void i(boolean z9) {
            this.f43548c = z9;
        }

        void l() {
            this.f43546a.setTransformationMethod(e(this.f43546a.getTransformationMethod()));
        }
    }

    static class b {
        b() {
        }

        abstract InputFilter[] a(InputFilter[] inputFilterArr);

        public abstract boolean b();

        abstract void c(boolean z9);

        abstract void d(boolean z9);

        abstract TransformationMethod e(TransformationMethod transformationMethod);
    }

    private static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f43549a;

        c(TextView textView) {
            this.f43549a = new a(textView);
        }

        private boolean f() {
            return !e.i();
        }

        @Override // f0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f43549a.a(inputFilterArr);
        }

        @Override // f0.f.b
        public boolean b() {
            return this.f43549a.b();
        }

        @Override // f0.f.b
        void c(boolean z9) {
            if (f()) {
                return;
            }
            this.f43549a.c(z9);
        }

        @Override // f0.f.b
        void d(boolean z9) {
            if (f()) {
                this.f43549a.i(z9);
            } else {
                this.f43549a.d(z9);
            }
        }

        @Override // f0.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f43549a.e(transformationMethod);
        }
    }

    public f(TextView textView, boolean z9) {
        N.f.h(textView, "textView cannot be null");
        if (z9) {
            this.f43545a = new a(textView);
        } else {
            this.f43545a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f43545a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f43545a.b();
    }

    public void c(boolean z9) {
        this.f43545a.c(z9);
    }

    public void d(boolean z9) {
        this.f43545a.d(z9);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f43545a.e(transformationMethod);
    }
}
