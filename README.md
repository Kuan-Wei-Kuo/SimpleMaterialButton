# SimpleMaterialButton

##OK! Guys, this is the very simple button example. I hope anyone can learn something from here.

###example image:
![alt tag](https://github.com/Kuan-Wei-Kuo/SimpleMaterialButton/blob/master/readyMeImage/exmapleImage.png?raw=true)
###example video:
![alt tag](https://github.com/Kuan-Wei-Kuo/SimpleMaterialButton/blob/master/readyMeImage/exmapleVideo.mp4?raw=true)
##You see that is really beautiful. This Button can support 5.0 and below.

#How to Usage

##Step.1 Xml

     <com.kuo.materiallistitem.SimpleMaterialButton
        android:id="@+id/simpleMaterialButton"
        android:layout_width="match_parent"
        android:layout_height="60dp"/>
        
##Step.2 Java

###initialize

    private SimpleMaterialButton simpleMaterialButton_1;
    simpleMaterialButton_1 = (SimpleMaterialButton) findViewById(R.id.simpleMaterialButton_1);
    
###ClickListener

    simpleMaterialButton_1.setAnimationEndListener(buttonAnimationListener);
    simpleMaterialButton_2.setAnimationEndListener(buttonAnimationListener);
    simpleMaterialButton_3.setAnimationEndListener(buttonAnimationListener);
    
    private SimpleMaterialButton.onAnimationEnd buttonAnimationListener = new SimpleMaterialButton.onAnimationEnd() {
        @Override
        public void onAnimationEnd(SimpleMaterialButton simpleMaterialButton) {
            switch (simpleMaterialButton.getId()){
                case R.id.simpleMaterialButton_1:
                    Toast.makeText(simpleMaterialButton.getContext(), "simpleMaterialButton_1", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.simpleMaterialButton_2:
                    Toast.makeText(simpleMaterialButton.getContext(), "simpleMaterialButton_2", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.simpleMaterialButton_3:
                    Toast.makeText(simpleMaterialButton.getContext(), "simpleMaterialButton_3", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };

#Method

##Text
    
    setText(String text)
    setTextSize(int size)
    setTextColor(int color)

##Icon
    
    setIconResource(int resId)

##CircleBackground

    setCircleX(float circleX)
    setCricleBackgroundRaduis(float circleBackgroundRaduis)
    setCricleBackgroundColor(int circleBackgroundColor)
    
    
    
    
    
        

        
        
