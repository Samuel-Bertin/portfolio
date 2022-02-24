gsap.registerPlugin(ScrollTrigger);
var tl = gsap.timeline();

tl.from('.wolf-animation', {
    duration: 2,
    y: -200,
    opacity: 0,
    scale: 0.5,
    stagger: 0.3
});

gsap.from(".logo", {
    duration: 2,
    opacity: 0,
})

gsap.from(".content", {
    duration: 1.5,
    x: 300,
    opacity:0,
    ease: Power4.easeOut
})

gsap.from(".social-items", {
    duration: 2,
    x: 300,
    opacity: 0.5,
    ease: Power4.easeOut
}, "+=3")

gsap.from(".nav-items", {
    duration: 2,
    x: -300,
    opacity: 0.5,
    ease: Power4.easeOut
}, "+=3")

gsap.from(".transition1", {
    scrollTrigger: {
        trigger: '.transition1',
        start: "top bottom"
    },
    opacity: 0,
    scale: 0.7,
    duration: 2,
    stagger: .3,
    ease: 'power3.out"'
})

gsap.from(".transition2", {
    scrollTrigger: {
        trigger: '.transition2',
        start: "top bottom"
    },
    opacity: 0,
    scale: 0.7,
    x:-500,
    duration: 2,
    stagger: .3,
    ease: 'power3.out"'
})

gsap.from(".transition3", {
    scrollTrigger: {
        trigger: '.transition3',
        start: "top bottom"
    },
    opacity: 0,
    scale: 0.7,
    x:500,
    duration: 2,
    stagger: .3,
    ease: 'power3.out"'
})