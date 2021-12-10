   binding!!.WebView.webViewClient = WebViewClient()
        binding!!.WebView.loadUrl("https://docs.google.com/forms/d/101uGRBM_oiwx4sipTbp6We5lmqO4HVJxME9sOv1FOAg/viewform?edit_requested=true")
        val websettings = binding!!.WebView.settings
        websettings.javaScriptEnabled = true

        binding.WebView.setOnKeyListener(object : View.OnKeyListener {
            override fun onKey(p0: View?, p1: Int, p2: KeyEvent?): Boolean {
                if (p2!!.action == KeyEvent.ACTION_DOWN){
                    if (p1==KeyEvent.KEYCODE_BACK){
                        if (binding!!.WebView != null){
                                if (binding!!.WebView.canGoBack()){
                                    binding!!.WebView.goBack()
                                }else{
                                    activity?.onBackPressed()
                                }
                        }
                    }
                }
                return true
            }

        })
        
        
        
        veb view fragment er vitor
        
